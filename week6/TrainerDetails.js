import { useParams } from 'react-router-dom';
import trainers from './TrainersMock';

const TrainerDetails = () => {
  const { id } = useParams();
  const trainer = trainers.find(t => t.trainerId === parseInt(id));

  if (!trainer) return <div>Trainer not found</div>;

  return (
    <div>
      <h2>{trainer.name}</h2>
      <p>Email: {trainer.email}</p>
      <p>Phone: {trainer.phone}</p>
      <p>Technology: {trainer.technology}</p>
      <p>Skills: {trainer.skills.join(', ')}</p>
    </div>
  );
};

export default TrainerDetails;
